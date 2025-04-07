// 02-13 화살표 함수 버전 - 답안

var obj = { result: 0 };
obj.add = function (x, y) {
    const inner = () => {
        // 화살표 함수 사용할 경우 this가 따로 생성되지 않고, add 함수의 this(obj)를 상속받는다.
        this.result = x + y;
    };
    inner();
};
obj.add(3, 4);

console.log(obj);
