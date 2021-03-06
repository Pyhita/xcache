package com.yangtao.rpc;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Autuor: innthehell
 * @Date: 2022/1/16 - 01 - 16 - 19:47
 * @Description: com.yangtao.rpc
 * @Version: 1.0
 */
@Getter
@Setter
public class Response<T> implements Serializable {


    private T result;

    public Response(T result) {
        this.result = result;
    }

    private Response(Builder builder) {
        setResult((T) builder.result);
    }

    public static Response ok() {
        return new Response<>("ok");
    }

    public static Response fail() {
        return new Response<>("fail");
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    @Override
    public String toString() {
        return "Response{" +
                "result=" + result +
                '}';
    }

    public static final class Builder {

        private Object result;

        private Builder() {
        }

        public Builder result(Object val) {
            result = val;
            return this;
        }

        public Response build() {
            return new Response(this);
        }
    }
}

