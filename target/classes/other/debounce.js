function debounce(func, wait) {
  let timeout
  return function () {
    clearTimeout(timeout)
    timeout = setTimeout(() => func.apply(this, arguments), wait)
  }
}


function test(val) {
  // console.log('context', this)
  console.log('arguments', arguments)
  console.log(val)
}

let test1 = debounce(test, 1000)

test1(1)
test1(2)
test1(3)
setTimeout(() => test1(4), 1000)
