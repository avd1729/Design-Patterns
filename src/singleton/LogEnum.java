package singleton;

public enum LogEnum {
    INFO, WARN, ERROR, FATAL
}

class Client {
    public static void main(String[] args) {
        LogEnum logEnum = LogEnum.FATAL;
    }
}
