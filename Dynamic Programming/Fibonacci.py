def fibonacci_recursion(n,dp):
    if n == 0 or n==1:
        return n
    if dp[n]!=-1:
        return dp[n]
    ans = fibonacci_recursion(n-1,dp)+fibonacci_recursion(n-2,dp)
    dp[n] = ans
    return dp[n]

def fibonacci_memoization(n,dp1):
    dp1[0] = 0
    dp1[1] = 1

    for i in range(2,n+1):
        dp1[i] = dp1[i-1]+dp1[i-2]
    return dp1[n]

def fibonacci_tabulation(n):
    prev1 = 1
    prev2 = 0

    for i in range(2,n+1):
        curr = prev1+prev2
        prev2 = prev1
        prev1 = curr
    return prev1





n = 800
dp1 = [-1]*(n+1)
dp = [-1]*(n+1)
print(fibonacci_recursion(n,dp))
print(fibonacci_memoization(n,dp1))
print(fibonacci_tabulation(n))
