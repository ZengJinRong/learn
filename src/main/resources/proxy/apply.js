// function delay(f, ms) {
//   return function() {
//     setTimeout(() => f.apply(this, arguments), ms);
//   };
// }

function delay(f, ms) {
  return new Proxy(f, {
    apply(target, thisArg, argArray) {
      setTimeout(() => target.apply(thisArg, argArray), ms)
    },
  })
}

function sayHi(user) {
  console.log(`Hello, ${user}!`)
}

sayHi = delay(sayHi, 3000)

console.log(sayHi.length) // 1 (*) proxy 将“获取 length”的操作转发给目标对象

sayHi('John') // Hello, John!（3 秒后）
