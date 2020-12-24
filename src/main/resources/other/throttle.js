function throttle(f, ms) {
  let savedArgs
  let saveThis
  let isThrottled = false

  return function wrapper(...args) {
    if (isThrottled) {
      savedArgs = args
      saveThis = this
      return
    }

    f.apply(this, args)
    isThrottled = true

    setTimeout(() => {
      isThrottled = false
      if (savedArgs) {
        wrapper.apply(saveThis, savedArgs)
        saveThis = null
        savedArgs = null
      }
    }, ms)
  }
}


function f(a) {
  console.log(a);
}

// f1000 最多每 1000ms 将调用传递给 f 一次
let f1000 = throttle(f, 1000);

f1000(1); // 显示 1
f1000(2); // (节流，尚未到 1000ms)
f1000(3); // (节流，尚未到 1000ms)

// 当 1000ms 时间到...
// ...输出 3，中间值 2 被忽略
