// 홀짝 구분 프로그램
// 양의 정수만 입력 받기

let num = -21;

if (num % 2 == 0) {
    console.log('짝수');
} else if (num % 2 != 0 && num > 0) {
    console.log('홀수');
} else {
    console.log('양수만 입력 가능합니다.');
}
