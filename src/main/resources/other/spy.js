function spy(func) {
  function wrapper(...args) {
    wrapper.calls.push(`[${func.name}] ${args.join()}`)
    return func.apply(this, args)
  }

  wrapper.calls = []
  return wrapper
}


function work(a, b) {
  console.log(a + b) // work 是一个任意的函数或方法
}

work = spy(work)

work(1, 2) // 3
work(4, 5) // 9

for (let args of work.calls) {
  console.log(args) // "call:1,2", "call:4,5"
}
