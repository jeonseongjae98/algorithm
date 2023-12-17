# 🔎동적계획법(Dynamic Programming)이란?
- 큰 문제를 작은 문제로 나누어서 해결하는 방법
- 큰 문제 해결 위해 작은 문제를 활용 -> 점화식 만들 수 있음
- 분할과 정복이랑 다르게 이전 연산 기록하여 재사용
- 중간 계산 결과를 기록하기 위한 메모리가 필요하다.
- 한번 계산한 부분을 기록해두기 때문에 다시 계산하지 않아서 속도가 빠르다.

## 메모이제이션(Memoization)
- 작은 문제 연산 값 기록하고 필요한 순간에 다시 연산하지 않고 기록했던 값 사용
- 중복 계산 줄여줌

## 타뷸레이션(Tabulation)
- 작은 문제부터 순차적으로 계산하며 상위로 올라가는 방법

### 동적계획법 예시
- 피보나치 수열

## Bottom-up과 Top-down
- Top-down
    - 큰 문제 해결하는데 작은 문제가 해결되지 않았다면 그 때 작은 문제 해결하는 방법
    - 주로 재귀함수 통해서 구현
    - 위에서 예시로 든 피보나치 수열 구하기가 이에 해당됨

```JAVA
	static int[] fibo = new int[100];
	
	public static int F(int n) {
		if (n <= 2)
			return 1;
        //배열에 연산 값이 없으면 계산하여 저장해주기
		if (fibo[n] == 0) 
			fibo[n] = F(n - 1) + F(n - 2);
		return fibo[n];
	}
```

- Bottom-up
    - 작은 문제를 해결하면서 큰 문제를 해결하는 방법
    - 주로 반복문으로 구현
```JAVA
	static int[] fibo = new int[100];

	public static int F(int n) {
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo[n];
	}
```

## DP의 사용 조건
- DP가 적용되기 위해서는 2가지 조건을 만족해야 한다.
1) Overlapping Subproblems(겹치는 부분 문제)
2) Optimal Substructure(최적 부분 구조)


### Overlapping Subproblems
- DP는 기본적으로 문제를 나누고 그 문제의 결과 값을 재활용해서 전체 답을 구한다. 그래서 동일한 작은 문제들이 반복하여 나타나는 경우에 사용이 가능하다.

- 즉, DP는 부분 문제의 결과를 저장하여 재 계산하지 않을 수 있어야 하는데, 해당 부분 문제가 반복적으로 나타나지 않는다면 재사용이 불가능하니 부분 문제가 중복되지 않는 경우에는 사용할 수 없다.

- 예를 들어, 이진 탐색(참고)와 피보나치 수열의 경우를 비교해 보자.

- 이진 탐색은 특정 데이터를 정렬된 배열 내에서 그 위치를 찾기 때문에 그 위치를 찾은 후 바로 반환할 뿐 그것을 재사용하는 과정을 거치지 않는다. 반면, 피보나치 수열은 f(n) = f(n-1) + f(n-2) 인데, 트리 구조로 함수가 호출되게 된다.

- f(3), f(2), f(1)과 같이 동일한 부분 문제가 중복되어 나타난다. 그러므로 1회 계산했을 때, 저장된 값을 재활용할 수 있게 되는 것이다.

### Optimal Substructure(최적 부분 구조)
- 부분 문제의 최적 결과 값을 사용해 전체 문제의 최적 결과를 낼 수 있는 경우를 의미한다. 그래서 특정 문제의 정답은 문제의 크기에 상관없이 항상 동일하다!

- 만약, A - B까지의 가장 짧은 경로를 찾고자 하는 경우를 예시로 할 때, 중간에 X가 있을 때, A - X / X - B가 많은 경로 중 가장 짧은 경로라면 전체 최적 경로도 A - X - B가 정답이 된다.

    [![1.jpg](https://i.postimg.cc/SskQN0t2/1.jpg)](https://postimg.cc/JyYCPF8M)

- 위의 그림에서 A - X 사이의 최단 거리는 AX2이고 X - B는 BX2이다. 전체 최단 경로는 AX2 - BX2이다. 다른 경로를 택한다고 해서 전체 최단 경로가 변할 수는 없다.

- 이와 같이, 부분 문제에서 구한 최적 결과가 전체 문제에서도 동일하게 적용되어 결과가 변하지 않을 때 DP를 사용할 수 있게 된다.

## DP 사용하기
- 일반적으로 DP를 사용하기 전에는 아래의 과정을 거쳐 진행할 수 있다.

1) DP로 풀 수 있는 문제인지 확인한다.
2) 문제의 변수 파악
3) 변수 간 관계식 만들기(점화식)
4) 메모하기(memoization or tabulation)
5) 기저 상태 파악하기
6) 구현하기