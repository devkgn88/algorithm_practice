<a href="https://myhits.vercel.app"><img src="https://myhits.vercel.app/api/hit/https%3A%2F%2Fgithub.com%2Fdevkgn88%2Falgorithm_practice?color=green&label=hits&size=small" alt="hits" /></a>
# 🧠 Algorithm Practice
이 저장소는 백준(Baekjoon) 등 다양한 플랫폼의 문제를 **Java로 풀이하며 기록**하는 공간입니다.

## 📌 목적

- 문제 풀이를 통해 알고리즘 역량 강화
- 상시 SW 역량 테스트 및 코딩테스트 실전 대비
- 꾸준한 기록과 커밋으로 성장의 흐름을 시각화

## 💡 입출력 템플릿
문제 대부분은 입력을 받아 가공 후 출력하는 패턴입니다.<br>
아래와 같은 이유로 BufferedReader와 BufferedWriter를 사용합니다. 

### ✅ 사용 이유
- Scanner보다 빠른 입출력 처리 가능
- 대용량 입출력 환경에서 예외 발생 가능성을 줄이고 채점 시스템과의 호환성 ↑
- 대부분의 문제에서 안정적으로 사용 가능
```java
import java.io.*;

public class BOJ_문제번호 {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // 입력 처리
            String input = br.readLine();

            // 로직 처리
            int result = input.length(); // 예시

            // 출력 처리
            bw.write(String.valueOf(result));
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## 🏅 백준 티어
> [!NOTE]
> 아래 뱃지는 백준에서의 실시간 티어를 나타냅니다.<br>

[![Solved.ac Profile](http://mazassumnida.wtf/api/v2/generate_badge?boj=devkgn88)](https://solved.ac/devkgn88/)
