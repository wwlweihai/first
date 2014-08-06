package cn.ww.mapper;

import java.util.List;

import cn.ww.model.ClientUser;

public interface ClientUserMapper {
	public void insertClientUser(ClientUser clientUser);
	public List<ClientUser> getClientUserAll();
	public ClientUser getClientUser(int id);
}
