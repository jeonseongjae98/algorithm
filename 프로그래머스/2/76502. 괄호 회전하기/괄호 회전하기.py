def solution(s):
    answer = 0
    s = list(s)
    for _ in range(len(s)):
        st = []
        for i in range(len(s)):
            if len(st)>0:
                if st[-1] == '[' and s[i] == ']':
                    st.pop()
                elif st[-1] == '{' and s[i] == '}':
                    st.pop()
                elif st[-1] == '(' and s[i] == ')':
                    st.pop()
                else:
                    st.append(s[i])
            else:
                st.append(s[i])
        
        if len(st) == 0:
            answer+=1
        s.append(s.pop(0))
    return answer