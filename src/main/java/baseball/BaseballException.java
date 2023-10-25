package baseball;

public class BaseballException {

    private BaseballService baseballService = new BaseballService();

    // 중복 검사 함수
    public void isDuplicationExist(String randomNum) {
        if (baseballService.isDuplicationExist(randomNum)) {
            throw new IllegalArgumentException();
        }
    }

    // 문자열이 모두 숫자로만 이루어져있는지 검사하는 함수
    public void isCharinString(String randomNum) {
        // 플레이어가 입력한 수에 문자가 있는 경우 예외처리
        if (baseballService.isCharacterExist(randomNum)){
            throw new IllegalArgumentException();
        }
    }

    public void isLengthValid(String randomNum){
        // 플레이어가 입력한 수가 3자리 수가 아닌 경우 예외처리
        if (randomNum.length()!=3) {
            throw new IllegalArgumentException();
        }
    }

    public void isValidRestart(String restart){
        if (!"1".equals(restart) && !"2".equals(restart)){
            throw new IllegalArgumentException();
        }
    }

}
