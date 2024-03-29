
package study;

/**
 * Study.java
 */
class Account {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public Account(String userName,int id,String password){
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printAccountInfo() {
    	System.out.println("ユーザーの名前は、"+ this.userName);
    	System.out.println("IDは、" + this.id);
    	System.out.println("パスワードは、" + this.password);
    }

}