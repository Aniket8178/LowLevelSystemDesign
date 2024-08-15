
public class Main {
	
	public static void main(String[] args) {
		TV tv = new TV();
        Stereo stereo = new Stereo();
 
        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);
 
        // Create remote control
        RemoteControl remote = new RemoteControl();
 
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); 
 
        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); 
 
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); 
 
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); 
	}
}
