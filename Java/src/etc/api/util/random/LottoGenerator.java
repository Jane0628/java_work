package etc.api.util.random;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
  private static final int LOTTO_SIZE = 6;  // 로또 번호 개수
  private static final int LOTTO_MAX = 45;  // 로또 번호 최대 값

  public static void main(String[] args) {
    int[] lottoNumbers = generate();
    System.out.println(Arrays.toString(lottoNumbers));
  }

  public static int[] generate() {
    int[] lottoNumbers = new int[LOTTO_SIZE]; // 로또 번호를 저장할 배열
    Random random = new Random(); // 난수 생성을 위한 Random 객체 생성

    for (int i = 0; i < LOTTO_SIZE; i++) {
      int number = random.nextInt(LOTTO_MAX) + 1; // 1 ~ 45 사이의 난수 생성

      // 중복되는 숫자가 있는지 검사
      for (int j = 0; j < i; j++) {
        if (lottoNumbers[j] == number) { // 중복된 숫자 발견
          number = random.nextInt(LOTTO_MAX) + 1; // 새로운 숫자 생성
          j = -1; // 처음부터 다시 검사
        }
      }

      lottoNumbers[i] = number; // 중복되지 않는 숫자 저장
    }

    Arrays.sort(lottoNumbers); // 로또 번호를 오름차순으로 정렬
    return lottoNumbers;
  }
}
