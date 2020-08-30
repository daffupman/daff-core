package io.daff.exception;

import io.daff.enums.Codes;

/**
 * 文件上传异常
 *
 * @author daffupman
 * @since 2020/7/13
 */
public class FileUploadException extends BaseException {

    public FileUploadException() {
        super(Codes.FILE_UPLOAD_ERROR, "文件上传发生错误，请稍后重新");
    }

    public FileUploadException(String message) {
        super(Codes.FILE_UPLOAD_ERROR, message);
    }
}
