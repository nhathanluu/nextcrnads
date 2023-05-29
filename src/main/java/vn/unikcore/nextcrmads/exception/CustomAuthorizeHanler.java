package vn.unikcore.nextcrmads.exception;

import java.util.function.Supplier;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import vn.unikcore.nextcrmads.security.authorization.CustomAuthorize;

@Component
public class CustomAuthorizeHanler extends DefaultMethodSecurityExpressionHandler {
    @Override
    public EvaluationContext createEvaluationContext(
            Supplier<Authentication> authentication, MethodInvocation mi) {
		StandardEvaluationContext context = (StandardEvaluationContext) super.createEvaluationContext(authentication, mi);
        CustomAuthorize root = new CustomAuthorize(authentication);
	    root.setPermissionEvaluator(getPermissionEvaluator());
	    root.setTrustResolver(new AuthenticationTrustResolverImpl());
        root.setRoleHierarchy(getRoleHierarchy());
        context.setRootObject(root);
        return context;
    }
}