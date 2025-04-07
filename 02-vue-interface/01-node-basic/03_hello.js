// 매개변수에 기본값을 설정한 경우
function hello(name = '이름 없음') {
    return name + '님, 안녕하세요?';
}

const result = hello();
console.log(result);
