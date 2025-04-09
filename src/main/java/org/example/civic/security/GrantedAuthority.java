package org.example.civic.security;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {
    String getAuthority();
}
