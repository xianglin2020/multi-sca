package sca.api;

public class ApiRes<T> {
    private boolean success;
    private String message;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiRes{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static <T> ApiRes<T> ok(T data) {
        var res = new ApiRes<T>();
        res.setData(data);
        res.setSuccess(true);
        return res;
    }
}
