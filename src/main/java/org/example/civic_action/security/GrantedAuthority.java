package org.example.civic_action.security;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {
    String getAuthority();
}
