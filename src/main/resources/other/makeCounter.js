function makeCounter() {
  function counter() {
    counter.count++
  }

  counter.count = 0

  counter.set = function (value) {
    counter.count = value
  }

  counter.decrease = function () {
    counter.count--
  }

  return counter()
}
