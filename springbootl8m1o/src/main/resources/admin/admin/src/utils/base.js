const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootl8m1o/",
            name: "springbootl8m1o",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootl8m1o/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "贸易行业crm系统"
        } 
    }
}
export default base
