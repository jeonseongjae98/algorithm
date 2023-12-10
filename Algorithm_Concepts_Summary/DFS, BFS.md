# DFS/BFS 개념 정리

## 1. 그래프 탐색 알고리즘
### 그래프?
- 여러 개체들이 연결되어 있는 자료구조

### 탐색?
- 특정 개체를 찾기 위한 알고리즘

## 대표적인 문제 유형
- 경로탐색 유형 (최단거리, 시간)
	-	a에서 b지점까지 가는데 최소 거리/최단 시간 구하기

- 네트워크 유형 (연결)
	- 여러 개체들이 주어진 상태에서 연결되어 있는 그룹의 개수를 구하거나 두 개체가 같은 네트워크 안에서 연결되어 있는지 확인하기

- 조합 유형 (모든 조합 만들기)
	- 여러가지의 조합을 모두 만들고 비교하기

## 2. DFS/BFS란?
```
<예시>
DFS : 드라마 하나를 끝까지 보고 다른 드라마를 본다.
BFS : 여러 개의 드라마를 한편씩 본다.
```
[![1.jpg](https://i.postimg.cc/j2gyBPXj/1.jpg)](https://postimg.cc/gLhwZw19)

### DFS (Depth First Search : 깊이 우선 탐색)
- 루트노드에서 시작해 다음 분기로 넘어가기 전 해당 분기를 완벽하게 탐색하는 방식으로 **스택** 또는 **재귀함수**로 구현한다.
- 특징: </br>
	1. 탐색 공간 자체는 크지만 깊이가 유한할 때(공간 복잡도가 작다)
	2. 최단 경로가 아니어도 괜찮을 때
	3. 재귀함수로 구현 -> 현재 검사하는 상태에서 전이할 수 있는 상태라면 해당 상태로 전이
	4. 시작하는 부분에서 한쪽 분기 정하고 최대 깊이까지 탐색 후 다른 분기로 이동, 다시 최대 깊이까지 탐색 ... 
	5. 단절점 찾기, 단절선 찾기, 위상정렬, 사이클 찾기 등.. 

### BFS (Breadth First Search : 넓이 우선 탐색)
- 루트노드에서 시작해 인접한 노드를 먼저 탐색하는 방식으로 시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법이다. **큐**를 이용해서 구현한다.
- 특징: </br>
	1. 초기 상태에서 가까운 상태부터 탐색
	2. 최단 거리나 최단 시간 등 목표 상태에서 도달할 수 있는 가장 빠른 경로 탐색 
	3. 탐색 공간의 깊이 제약이 없는 편이나 공간복잡도가 크다 
	4. 큐를 사용, 큐가 탐색 공간을 나타내고 큐에 다음 탐색할 것들을 추가하는 방식으로 진행 .. 

## 문제 유형별 정리

1. 그래프의 모든 정점을 방문하는 것이 주요한 문제
단순히 모든 정점을 방문하는 것이 중요한 문제의 경우 DFS, BFS 두 가지 방법 중 어느 것을 사용해도 상관없다.</br>
	→ **BFS, DFS 둘 중 편한 것 사용**

2. 경로의 특징을 저장해둬야 하는 문제
예를 들면 각 정점에 숫자가 적혀있고 a부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안 된다는 문제 등, 각각의 경로마다 특징을 저장해둬야 할 때는 DFS를 사용한다.</br>
	→ **BFS는 경로의 특징을 가지지 못함**

3. 최단거리 구해야 하는 문제
미로 찾기 등 최단거리를 구해야 할 경우, BFS가 유리하다. 왜냐하면 깊이 우선 탐색(=DFS)으로 경로를 검색할 경우 처음으로 발견되는 해답이 최단거리가 아닐 수 있지만, 너비 우선 탐색으로 현재 노드에서 가까운 곳부터 찾기 때문에 경로를 탐색 시 먼저 찾아지는 해답이 곧 최단거리기 때문이다.</br>
	→ **최단거리는 BFS**

## Java에서 DFS와 BFS의 구현
1. DFS의 Java구현
- DFS는 스택과 재귀함수를 통해 구현할 수 있지만 일반적으로 재귀함수를 통하여 구현한다.
- 반드시 방문 여부를 저장할 방문 여부 배열 필요! </br></br>

```JAVA
boolean isVisited[] = new boolean[n];
Stack<Integer> stack = new Stack<>();

while (!stack.isEmpty()) {
    int state = stack.pop();
    if (isVisited[state]) {
        // continue 또는 리턴 
    }
    isVisited[state] = true;
    for (int next : getNext(state)) {
        if (!isVisited[next]) {
            stack.push(next);
        }
    }
}


// 재귀로 구현한다면 
static void DFS(int node) {
    checked[node] = true; // 먼저 방문했다고 표시
    System.out.print(node + " ");
    
    for (int j = 1; j <= n; j++) {
        if (check[node][j] == 1 && checked[j] == false) { // 이어져있고 방문 안한 곳 
            DFS(j);
        }
    }
}
```

2. BFS의 Java구현
- BFS는 일반적으로 Queue를 이용하여 구현한다.
- 큐에 넣어줄 때 방문 처리를 한다.

```JAVA
static void BFS(int num) {
    Queue<Integer> queue = new LinkedList<Integer>(); // 큐
    queue.offer(start); // 시작점도 Queue에 넣어야 함
    checked[start] = true; // 방문 표시
    System.out.print(start + " ");
    
    // Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
    while (!queue.isEmpty()) { 
        int temp = queue.poll();
      
        for (int j = 1; j <= n; j++) {
            if (check[temp][j] == 1 && checked[j] == false) { // 이어져있고 방문 안한 곳
                queue.offer(j); // 큐에 넣고
                checked[j] = true; // 방문 표시
                System.out.print(j + " ");
            }
        }
    }
}

```

<참고 링크> </br>
https://baaaaaaaaaaaaaaaaaaaaaaarkingdog.tistory.com/729
