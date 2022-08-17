function Soma(x) {
  return function (y) {
    return x + y;
  };
}

var soma2 = Soma(2);
var soma4 = Soma(4);

print(soma2(2)); // 4
print(soma4(2)); // 6
