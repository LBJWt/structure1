### 栈的实现  
`stack.ArrayStackDemo`
`stack.LinkedStackDemo`
- 栈的特性是 先进后出.
- 对栈的基本操作
   - 进栈 push(T value)
   - 出栈 pop()
   - 扩容 ensureCapacity(int minCapacity)
```
主要需要注意的是压栈需要考虑扩容，出栈需要考虑是否溢出，即栈是否是空的
```

