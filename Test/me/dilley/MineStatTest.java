/* JUnit tests for MineStat.java class */

package me.dilley;

import static org.junit.Assert.*;

import org.junit.Test;

public class MineStatTest {

	@Test
	// Tests if address is correct
	public void checkAddress() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setAddress("minecraft.dilley.me");
		String address = ms.getAddress();
		assertEquals("minecraft.dilley.me", address);
	}

	@Test
	// Tests if port number is correct
	public void checkPort() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setPort(25565);
		int port = ms.getPort();
		assertEquals(25565, port);
	}

	@Test
	// Tests if version number is correct
	public void checkVersion() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setVersion("B u n g e e C o r d   1 . 8 . x - 1 . 1 2 . x");
		String port = ms.getVersion();
		assertEquals("B u n g e e C o r d   1 . 8 . x - 1 . 1 2 . x", port);
	}

	@Test
	// Tests if number of current players are correct
	public void checkNumberOfCurrentPlayers() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setCurrentPlayers("0");
		String players = ms.getCurrentPlayers();
		assertEquals("0", players);
	}

	@Test
	// Tests if number of maximum players are correct
	public void checkNumberOfMaximumPlayers() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setMaximumPlayers("32");
		String maxPlayers = ms.getMaximumPlayers();
		assertEquals("32", maxPlayers);
	}

	@Test
	// Tests if the message of the day is correct
	public void checkMessageOfTheDay() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		ms.setMotd("� f � c � l F r a g   L a n d");
		String msg = ms.getMotd();
		assertEquals("� f � c � l F r a g   L a n d", msg);
	}

	@Test
	// Tests if the server is up
	public void checkThatServerIsUp() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		boolean up = ms.isServerUp();
		assertTrue(up);

	}

}
