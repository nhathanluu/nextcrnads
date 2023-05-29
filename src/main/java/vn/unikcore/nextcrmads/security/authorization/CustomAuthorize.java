package vn.unikcore.nextcrmads.security.authorization;

import java.util.function.Supplier;

import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.access.expression.method.MethodSecurityExpressionOperations;
import org.springframework.security.core.Authentication;

public class CustomAuthorize extends SecurityExpressionRoot implements MethodSecurityExpressionOperations {


    public CustomAuthorize(Supplier<Authentication> authentication) {
        super(authentication);
    }

    public Boolean requiredRole (String target, String method) {
        return true;
    }

    @Override
    public void setFilterObject(Object filterObject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFilterObject'");
    }

    @Override
    public Object getFilterObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilterObject'");
    }

    @Override
    public void setReturnObject(Object returnObject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReturnObject'");
    }

    @Override
    public Object getReturnObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReturnObject'");
    }

    @Override
    public Object getThis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThis'");
    }
}
