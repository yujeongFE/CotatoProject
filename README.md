# CotatoProject

<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/3ad3189e-30e0-4b66-ad57-0013f31ab748" alt="image" width="270" height="300" />
</p>


## 🖥️ 프로젝트 소개
- '코테이토' 프로젝트는 IT 연합동아리 '코테이토'의 운영에서 발생하는 복잡함과 어려움을 극복하기 위해 설계한 웹 기반 프로젝트입니다.
  
## 동기와 목표
- <b> 분산된 플랫폼과 소통의 어려움 </b><br/>
동아리 내부의 활동과 관리는 카카오톡, 엑셀, 네이버 카페와 같은 분산된 플랫폼을 이용하여 이루어졌습니다.<br/> 
이로 인해 부원들이 중요한 정보나 일정을 놓치는 경우가 발생했습니다.<br/> 
동아리 관리 또한 다양한 플랫폼을 오가며 이뤄지므로 제한적이고 비효율적인 측면이 있었습니다.

- <b> 통합된 회원 관리와 활동 관리 시스템 구현 </b> <br/>
 동아리 내부의 활동 정보 공유와 원활한 커뮤니케이션을 위한 '통합된 동아리 웹 서비스'를 구현하는 것을 목표로 하고 있습니다.

## 🕰️ 프로젝트 진행 기간
* 23.01.13 - 23.02.24

### 🧑‍🤝‍🧑 맴버구성
- 백엔드 (김호진, 이동영)
- 프론트엔드 (남연재, 유재원, 전유정)

     
## 📣 기술 스택
### Development
<img src="https://img.shields.io/badge/-ReactJs-61DAFB?logo=react&logoColor=white&style=for-the-badge"> <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"> 


## 📌 주요 기능
- 초기화면 <br/>
  메인 페이지에 접속했을 때, 로그인이 되어있지 않은 회원은 로그인을 하도록 자동으로 로그인 페이지로 이동합니다.

<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/4b2a3b4e-2957-4ba9-ba79-0fa59b5f2220" alt="image" width="500" height="250" />
</p>

  
- <b>로그인</b> <br/>
  회원 가입을 한 후, 로그인을 진행합니다. <br/>
  로그인에 성공하면 메인페이지로 이동합니다.

<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/7dac22e4-4f69-42ba-aa36-6a2a38c5a1b5" alt="image" width="500" height="250" />
</p>

- <b>메인 페이지</b> <br/>
  동아리 SNS 계정과 네이버 카페로 이동할 수 있습니다. <br/>
  네비게이션 바의 항목을 선택하면 해당 페이지로 이동합니다.

<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/9a64989c-fca5-4ef5-9ea5-cd3945794263" alt="image" width="500" height="250" />
</p>

- <b>일정 페이지</b> <br/>
  일정, 시작일, 종료일에 해당하는 값을 입력하고 등록하기 버튼을 누르면 해당하는 일정이 등록됩니다.
<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/4cdb4d30-b8be-4191-81d1-2146cd3dec6d" alt="image" width="500" height="300" />
</p>

- <b>게시글 생성 & 게시판</b> <br/>
  일반 유저들은 공지사항을 제외한 다른 카테고리로 글을 작성할 수 있습니다. <br/>
  관리자 유저는 공지사항에 글을 작성할 수 있습니다. <br/>
  작성한 글은 등록이 가능하며, 게시판에서 내용을 확인할 수 있습니다. <br/>
<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/9b918f45-28ec-4c8f-ace5-aa0107e6a777" alt="image" width="500" height="300" />
</p>


- <b>닉네임 변경</b> <br/>
  닉네임을 설정하지 않은 일반 사용자들의 이름은 기본적으로 '감자'가 됩니다. <br/>
  이는 마이페이지에서 닉네임을 변경할 수 있고, 비밀번호 또한 변경이 가능합니다. <br/>
  상,벌점 또한 확인이 가능하도록 구현했습니다.. <br/>
<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/a3308b3e-1c31-46db-9a9c-1b254a68e2fd" alt="image" width="500" height="300" />
</p>

- <b>투표</b> <br/>
  투표는 관리자로 등록되어 있는 계정만 생성할 수 있습니다.. <br/>
  메인 페이지에서 투표하기를 누르면, 생성된 투표를 확인할 수 있습니다. <br/>
 
<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/93967332-ba40-490f-99f2-02d020f7a5b5" alt="image" width="500" height="300" />
</p>

- <b>관리자 계정 - 상,벌점</b> <br/>
 관리자는 모든 회원의 상벌점을 관리할 수 있습니다. <br/>
특정 회원의 벌점이 5점을 초과할 경우, 그 회원의 아이디를 정지시킵니다. <br/>
 
<p align="center">
  <img src="https://github.com/khj1998/CotatoProject/assets/109844803/276fa328-8353-43e8-96a6-88111349fb16" alt="image" width="500" height="300" />
</p>




---------------------------------------------------------------------------------------------------------
<b>아래 문서는 백엔드와 프론트엔드 개발자들 간의 필요한 정보를 효율적으로 공유하고 협력하는 데 도움을 제공하기 위해 작성되었습니다.</b>

node_modules,package.json 제거하고 다시 npm init할 경우

프론트단에서 쓰는 react 버전이 17.0.2이기 때문에 새로 설치한 react 버전(18)과 호환되지 않는 문법이
존재한다.
=> react 버전은 17.0.2로 맞춘다.




App.js 코드중 MainPage, Login등 컴포넌트를 인식하지 못하는 버그 발생할시 => react-router-dom 6버전 이하 에러.

react-router-dom 6버전 이상 설치 해결 => <Route><Route/>들을 <Routes>로 감싸고, component = {컴포넌트/}로 작성된 코드를 element로 수정한다.
기존 6버전 이하 해결 => react-router-dom 6버전 이하는 Routes를 지원하지 않는다. <Route>를 <> </>로 감싸야한다.
  
해당 프로젝트에서는 react-router-dom 6버전 이하를 활용한다.


터미널에서 npm start 실행시 Missing script: "start" 에러를 뱉으며 실행 실패시 다음과 같이 설정한다.
package.json에서 "scripts"부분에 "start": "react-scripts start"를 추가한다.

----------------------------------------------------------------------------------------------------------

앱을 처음 clone해왔을 경우 아래의 코드들을 차례대로 입력해주세요!

cd frontend

npm init

npm init을 했을 때 입력하라고 나오는 것들에 대해서는 그냥 엔터키만 계속 누르면 됨.

npm i react-scripts

npm i react-router-dom

npm i redux react-redux

npm i styled-components

npm i axios

npm i redux-devtools-extension

npm i redux-actions

--"start": "react-scripts start"를 package.json의 "scripts"에 추가--

npm start를 하면 처음 나오는 문장에 y입력

위의 코드들은 clone해온 후 한번만 입력하시면 됩니다!



----------------------------------------------------------------------------------------------------------
npm i redux-saga-effects
  
yarn add datepicker
  
yarn add react-big-calendar
  
yarn add date-fns
  
yarn add react-scroll
  
yarn add semantic-ui-react
  
yarn add semantic-ui-css
  
yarn add chart.js
  
yarn add  @reactchartjs/react-chart.js
