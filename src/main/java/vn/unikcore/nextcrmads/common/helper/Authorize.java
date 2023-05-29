package vn.unikcore.nextcrmads.common.helper;

import java.io.Serializable;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

public class Authorize implements PermissionEvaluator {

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        return true;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
            Object permission) {
        return true;
    }

    public boolean hasPermission(Authentication authentication, String permission, String method) {
        return false;
    }
}
