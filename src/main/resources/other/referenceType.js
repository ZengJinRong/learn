const obj = {
  value: 'test',
  func() {
    // console.log(this)
    console.log(this.value)
  },
}

obj.func();

(obj.func)();

// let method = obj.func
// method()
(method = obj.func)();

(obj.func || obj.test)()

