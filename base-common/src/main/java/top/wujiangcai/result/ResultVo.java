package top.wujiangcai.result;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ResultVo<T> {
    //封装返回数据
    private String msg;
    private int code;
    private T data;
}

