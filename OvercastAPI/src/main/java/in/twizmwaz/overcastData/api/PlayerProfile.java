package in.twizmwaz.overcastData.api;

import com.google.common.base.Optional;
import in.twizmwaz.overcastData.api.util.Gender;

import java.util.Date;
import java.util.UUID;

/**
 * A PlayerProfile represents a player's Overcast profile.
 */
public interface PlayerProfile {

    /**
     * Represents the name of the player as of the last time they joined Overcast.
     *
     * @return The name, as a {@link String}
     */
    String getName();

    /**
     * @return The {@link UUID} of the Minecraft player.
     */
    UUID getUniqueId();

    /**
     * @return Whether or not the current user is presently online.
     */
    boolean isOnline();

    /**
     * @return The current kill to death ratio of the player.
     */
    double getKD();

    /**
     * @return The current kill to kill ratio of the player.
     */
    double getKK();

    /**
     * @return The total number of logged joins to Overcast.
     */
    int getJoins();

    /**
     * @return The user's first join {@link Date}
     */
    Date getFirstJoin();

    /**
     * @return The number of days played on Overcast
     */
    double getDaysPlayed();

    /**
     * @return The number of Raindrops a player has
     */
    int getRaindrops();

    /**
     * @return The gender of the player
     */
    Optional<Gender> getGender();

    /**
     * @return The player's set occupation
     */
    Optional<String> getOccupation();

    /**
     * @return The player's set interests
     */
    Optional<String> getInterests();

    /**
     * @return The player's set Skype name
     */
    Optional<String> getSkype();

    /**
     * @return The player's set Steam name
     */
    Optional<String> getSteam();

    /**
     * @return The player's set Twitter name
     */
    Optional<String> getTwitter();

    /**
     * @return The player's set Twitch name
     */
    Optional<String> getTwitch();

    /**
     * @return The player's set Facebook name
     */
    Optional<String> getFacebook();

    /**
     * @return The player's set GitHub name
     */
    Optional<String> getGithub();

    /**
     * @return The player's set Reddit name
     */
    Optional<String> getReddit();

    /**
     * @return The player's set YouTube name
     */
    Optional<String> getYouTube();

}
