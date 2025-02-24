package vision;

import accounts.ClientAccount;

public class LobClient extends LobClientForm{
    
    private ClientAccount client;

    public LobClient(ClientAccount client) {
        this.client = client; 
        setTitle("Cliente"); 
    }

    @Override
    public ClientAccount getClient() {
        return this.client; 
    }
}
