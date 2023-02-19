package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify.AreaNotify;
import emu.grasscutter.utils.FileUtils;

public class PacketWindSeedClientNotify extends BasePacket {

	public PacketWindSeedClientNotify(String givenPath) {
		super(1157);
		byte[] data;
		try {
			data = FileUtils.read(FileUtils.getDataPath(givenPath));
		} catch (Exception e) {
			Grasscutter.getLogger().error("Error Windy: ", e);
			return;
		}
		WindSeedClientNotify proto = WindSeedClientNotify
			.newBuilder()
			.setAreaNotify(
				AreaNotify.newBuilder().setAreaId(1).setAreaType(1).setAreaCode(ByteString.copyFrom(data)).build()
			)
			.build();
		this.setData(proto);
	}
}
