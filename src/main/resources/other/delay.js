function delay(f, ms) {
  return function (...args) {
    setTimeout(() => f.apply(this, args), ms)
  }
}


function f(x) {
  console.log(x);
}

// create wrappers
let f1000 = delay(f, 1000);
let f1500 = delay(f, 1500);

f1000("test"); // 在 1000ms 后显示 "test"
f1500("test"); // 在 1500ms 后显示 "test"
