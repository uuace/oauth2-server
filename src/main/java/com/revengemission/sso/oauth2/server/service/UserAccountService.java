package com.revengemission.sso.oauth2.server.service;

import com.revengemission.sso.oauth2.server.domain.JsonObjects;
import com.revengemission.sso.oauth2.server.domain.UserAccount;

public interface UserAccountService extends CommonServiceInterface<UserAccount> {
    JsonObjects<UserAccount> listByRole(String role, int pageNum,
                                        int pageSize,
                                        String sortField,
                                        String sortOrder);
}
