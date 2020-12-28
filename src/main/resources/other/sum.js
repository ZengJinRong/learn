function sum(x) {
  function sumFunc(x) {
    sumFunc.total += x
    return sumFunc
  }

  sumFunc.total = x

  sumFunc.toString = () => sumFunc.total

  Object.defineProperty(sumFunc, 'toString', {
    enumerable: false,
  })

  return sumFunc
}

// function sum(x) {
//   let total = x
//
//   function sumFunc(x) {
//     total += x
//     return sumFunc
//   }
//
//
//   sumFunc.toString = () => total
//
//   return sumFunc
// }


console.log(sum(1)(2).toString())
console.log(sum(1)(2)(3).toString())


console.log(Object.getOwnPropertyDescriptor(sum(1)(2),'total'))
console.log(Object.getOwnPropertyDescriptor(sum(1)(2),'toString'))


console.log(Object.getOwnPropertyDescriptors(sum(1)(2)))
