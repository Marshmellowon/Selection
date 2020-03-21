package com.company;

import java.util.Stack;

/**
 * Select
 */
class Select {
    private String[] arr; // 기준 배열 선언
    private Stack<String> st; // 조합을 저장할 스택 선언

    public Select(String[] arr) {
        this.arr = arr; // 배열을 받아 객체에 저장
        st = new Stack<String>(); // 스택에 메모리 할당
    }

    public void printstack() {
        // 스택에 있는 값을 출력
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i) + "");
        }
        System.out.println("\n");
    }

    public void cycle(int a, int b, int idx) {
        // a: 전체 개수, b: 뽑을 개수, idx: 현재 배열 가리키는 것
        if (b == 0) {
            // 0개 뽑음
            printstack();
            return;
        } else if (a == b) {
            // nCr 이라는 건 나머지를 전부 뽑겠다는 말과 같으므로 전부 스택에 넣은 후 출력하면 된다.
            for (int i = 0; i < a; i++)
                st.add(arr[idx + i]);// index부터 n개를 차례대로 스택에 넣고
            printstack(); // 스택을 보여준다.

            for (int i = 0; i < a; i++)
                st.pop(); // 이후 전부 pop을 시켜 다음 과정을 진행한다.

        } else {
            // 저 두가지 예외 사항을 빼면 점화식대로 진행하면 된다.

            // index를 포함하는 경우
            st.add(arr[idx]);
            cycle(a - 1, b - 1, idx + 1); // index를 스택에 넣은상태로 index를 1옮겨 그대로 진행.

            // index를 포함하지 않는 경우
            st.pop(); // index를 제거해주고
            cycle(a - 1, b, idx + 1); // index를 제외한 상태에서 a-1Cr 진행.

        }

    }
}
