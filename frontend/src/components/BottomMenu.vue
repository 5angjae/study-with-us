<template>
  <div>
    <router-view></router-view>
    <div class="bottom_menu">
      <div>
        <router-link to="/selfstudy" routerLinkActive="active"
          ><img class="icon" src="@/assets/images/1-1.png"
        /></router-link>
        <div class="mt-1">공부</div>
      </div>
      <div>
        <router-link to="/diary" routerLinkActive="active"
          ><img class="icon" src="@/assets/images/2.png"
        /></router-link>
        <div class="mt-1">기록</div>
      </div>
      <div>
        <router-link to="/main" routerLinkActive="active"
          ><img class="icon" src="@/assets/images/3-1.png"
        /></router-link>

        <div class="mt-1">홈</div>
      </div>
      <div>
        <router-link to="/studygroup" routerLinkActive="active"
          ><img class="icon" src="@/assets/images/4-2.png"
        /></router-link>
        <div class="mt-1">그룹</div>
      </div>
      <div>
        <router-link to="/mypage" routerLinkActive="active"
          ><img class="icon" src="@/assets/images/5.png"
        /></router-link>
        <div class="mt-1">마이페이지</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    logout() {
      this.$store.dispatch("login/deleteJWT");
      this.$router.push({ name: "EntrancePage" });
    },
  },
};
</script>

<style>
.router-link-active {
  text-decoration: none;
}

.bottom_menu {
  text-decoration: none;
  position: fixed;
  bottom: 0px;
  left: 0px;
  width: 100%;
  height: 8vh;
  z-index: 100;
  font-size: 3.5vw;
  /* border-top: 1px solid black; */
  background-color: #d8f2f4;
}

.bottom_menu > div {
  float: left;
  width: 20%;
  height: 100%;
  text-align: center;
  padding-top: 10px;
  font-family: "IM_Hyemin-Regular";
  font-size: 3vw;
  font-weight: 700;
}

.menuitem {
  font-family: "nanumsquare";
  font-size: 3vw;
  font-weight: 900;
}

.icon {
  width: 23px;
  height: 23px;
}
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.8s;
}
.fade-enter,
.fade-leave-to {
  opacity: 0;
}
</style>
