<!-- setup 메서드를 이용한 초기화 -->

<template>
    <div>
        X : <input type="text" v-model.number="x" /><br />
        Y : <input type="text" v-model.number="y" /><br />
    </div>
</template>

<script>
import { ref } from 'vue';

export default {
    name: 'Calc',
    setup() {
        const x = ref(10);
        const y = ref(20);
        // const x = 10;
        // const y = 20; 가능은 한데 반응성이 없음
        return { x, y };
    },
};
</script>
