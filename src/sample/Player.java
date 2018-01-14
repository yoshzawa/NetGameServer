/**
 * 
 */
package sample;

import java.util.Date;

/**
 * @author t.yoshizawa
 *
 */
public class Player {
	private int id;
	private String name;
	private int level;
	private Date lastLogin;
	private String message;
	private String loginUrl;
	private boolean Present;

	
	/**
	 * フルスペックのコンストラクタ
	 * @param id
	 * @param name
	 * @param level
	 * @param lastLogin
	 * @param message
	 * @param loginUrl
	 * @param hasPresent
	 */
	public Player(int id, String name, int level, Date lastLogin, String message, 
			String loginUrl, boolean hasPresent) {
		setId(id);
		setName(name);
		setLevel(level);
		setLastLogin(lastLogin);
		setMessage(message);
		setLoginUrl(loginUrl);
		setPresent(hasPresent);
	}
	
	/**
	 * メッセージとURLを省略するコンストラクタ
	 * @param id
	 * @param name
	 * @param level
	 * @param lastLogin
	 * @param hasPresent
	 */
	public Player(int id, String name, int level, Date lastLogin,  
			 boolean hasPresent) {
		this(id,name,level,lastLogin,"デフォルトのメッセージ",
				"http://www.jc-21.ac.jp",hasPresent);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public boolean hasPresent() {
		return Present;
	}

	public void setPresent(boolean hasPresent) {
		this.Present = hasPresent;
	}

}
