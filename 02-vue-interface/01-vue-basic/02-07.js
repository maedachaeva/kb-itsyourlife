// 구조 분해
// 배열, 객체의 값들을 추출하여 한 번에 여러 변수에 할당할 수 있는 기능

let arr = [10, 20, 30, 40];
let [a1, a2, a3] = arr;
console.log(a1, a2, a3);

let p1 = { name: '홍길동', age: 20, gender: 'M' };
let { name: n, age: a, gender } = p1;
console.log(n, a, gender);

// 구조 분해하면서 변수 이름 바꾸고 싶을 때
// 속성명: 새변수명

// name: n
// == p1.name 값을 변수 n에 저장
