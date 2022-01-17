package com.yangtao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * @Autuor: innthehell
 * @Date: 2022/1/16 - 01 - 16 - 19:11
 * @Description: com.yangtao.pojo
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
public class Command {
    String key;

    String value;

    public Command(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private Command(Builder builder) {
        setKey(builder.key);
        setValue(builder.value);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command command = (Command) o;
        return Objects.equals(key, command.key) &&
                Objects.equals(value, command.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public static final class Builder {

        private String key;
        private String value;

        private Builder() {
        }

        public Builder key(String val) {
            key = val;
            return this;
        }

        public Builder value(String val) {
            value = val;
            return this;
        }

        public Command build() {
            return new Command(this);
        }
    }


}
