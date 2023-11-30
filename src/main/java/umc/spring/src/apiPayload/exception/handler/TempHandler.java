package umc.spring.src.apiPayload.exception.handler;

import umc.spring.src.apiPayload.code.BaseErrorCode;
import umc.spring.src.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
