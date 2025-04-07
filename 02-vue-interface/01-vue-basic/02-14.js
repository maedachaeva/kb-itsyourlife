// 02-13 bind() 버전 - 답안

var obj = { result: 0 };
obj.add = function (x, y) {
    function inner() {
        this.result = x + y;
    }

    // inner 함수의 this를 obj로 고정
    inner = inner.bind(this);
    inner();
};
obj.add(3, 4);

console.log(obj);
