package in.twizmwaz.overcastData.parser;

import com.google.common.base.Optional;
import in.twizmwaz.overcastData.api.PlayerProfile;
import in.twizmwaz.overcastData.api.util.Gender;

import java.util.Date;
import java.util.UUID;

/**
 * An implementation of PlayerProfile by parsing the Overcast website
 */
public class PlayerProfileParser implements PlayerProfile {

    private String name;
    private UUID uuid;
    private boolean online;
    private double kd;
    private double kk;
    private int joins;
    private Date firstJoin;
    private double daysPlayed;
    private int rainDrops;
    private Optional<Gender> gender;
    private Optional<String> occupation;
    private Optional<String> interests;
    private Optional<String> skype;
    private Optional<String> steam;
    private Optional<String> twitter;
    private Optional<String> twitch;
    private Optional<String> facebook;
    private Optional<String> github;
    private Optional<String> reddit;
    private Optional<String> youTube;

    public PlayerProfileParser(String name) {
        this.name = name;
        //TODO: Implement website fetching/parsing
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UUID getUniqueId() {
        return uuid;
    }

    @Override
    public boolean isOnline() {
        return online;
    }

    @Override
    public double getKD() {
        return kd;
    }

    @Override
    public double getKK() {
        return kk;
    }

    @Override
    public int getJoins() {
        return joins;
    }

    @Override
    public Date getFirstJoin() {
        return firstJoin;
    }

    @Override
    public double getDaysPlayed() {
        return daysPlayed;
    }

    @Override
    public int getRaindrops() {
        return rainDrops;
    }

    @Override
    public Optional<Gender> getGender() {
        return gender;
    }

    @Override
    public Optional<String> getOccupation() {
        return occupation;
    }

    @Override
    public Optional<String> getInterests() {
        return interests;
    }

    @Override
    public Optional<String> getSkype() {
        return skype;
    }

    @Override
    public Optional<String> getSteam() {
        return steam;
    }

    @Override
    public Optional<String> getTwitter() {
        return twitter;
    }

    @Override
    public Optional<String> getTwitch() {
        return twitch;
    }

    @Override
    public Optional<String> getFacebook() {
        return facebook;
    }

    @Override
    public Optional<String> getGithub() {
        return github;
    }

    @Override
    public Optional<String> getReddit() {
        return reddit;
    }

    @Override
    public Optional<String> getYouTube() {
        return youTube;
    }
}
