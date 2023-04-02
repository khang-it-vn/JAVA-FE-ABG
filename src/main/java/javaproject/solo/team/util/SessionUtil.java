package javaproject.solo.team.util;

import jakarta.servlet.http.HttpSession;
import javaproject.solo.team.entity.AccountResponse;
import javaproject.solo.team.entity.ResponseRole;

public class SessionUtil {

    public static final int USER_ROLE = 0;
    public static final int DOC_ADMIN_ROLE = 1;
    public static final int STORE_ADMIN_ROLE = 2;
    public static boolean checkToken(HttpSession session)
    {
        if(session.getAttribute("Role") != null)
        {
            return  true;
        }
        return  false;
    }

    public static int checkRole(HttpSession session)
    {
        return ((ResponseRole)(session.getAttribute("Role"))).getFrom();
    }

    public static AccountResponse getInfoCurrent(HttpSession session)
    {
        return (AccountResponse)(session.getAttribute("Account"));
    }

}
