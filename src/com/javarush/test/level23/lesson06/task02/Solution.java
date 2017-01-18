package com.javarush.test.level23.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {
    public static   final class Constants {
        public static final String Server_Not_Accessible = "Server is not accessible for now.";
        public static final String Unauthorized_User = "User is not authorized.";
        public static final String Banned_User = "User is banned.";
        public static final String _Restriction = "Access is denied.";
    }

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
        super(Constants.Server_Not_Accessible);        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.Server_Not_Accessible, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.Unauthorized_User);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.Unauthorized_User, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.Banned_User);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.Banned_User, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants._Restriction);
        }

        public RestrictionException(Throwable cause) {
            super(Constants._Restriction, cause);
        }


    }

}
