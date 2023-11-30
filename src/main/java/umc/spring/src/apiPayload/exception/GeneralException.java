package umc.spring.src.apiPayload.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import umc.spring.src.apiPayload.code.BaseErrorCode;
import umc.spring.src.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException{

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
