# Game Design Document - Dungeon Builder

Dungeon builder is a dungeon crawler where a player controlled party of units explore and clear other player made dungeons for treasure.

## Matchmaking
Dungeon Builder matches players wanting to explore a dungeon with a player made dungeon. Dungeon Builder's matchmaking algorithm discerns what dungeon would be appropriate for a party based on the player's and dungeon's **Strength Rating**, henceforth denoted as **SR** for short.

> The exploring party's **SR** is based on its strength potential. This potential is a metric of how many resources they have to allocate to their party members through various upgrades, items, and customization.

After a dungeon is created, the game decides what its Strength Rating is based on a win/loss ratio of other players. This will be covered in depth in the Dungeon Editing section of this document later. 

Once Dungeon Builder has identified the **SR** of the exploring party, it matches the party with an appropriate dungeon within a certain range of the party **SR**. After the player has cleared or failed the dungeon, Dungeon Builder updates its database with the results of the match and reevaluates the **SR** of the dungeon if needed.

Dungeon Builder's original prediction of a dungeon's **SR** after its creation should be fairly indicative of its permanent **SR** but it reevaluates dungeons to account for shifts in the game meta that might make certain dungeons suddenly easier or more difficult due to game balancing or added content. 

One of the game's objectives is to keep players invested, and players won't maintain investment if:
- Clearing a dungeon for resources no longer becomes meaningful because they can be obtained too easily
- Dungeons are no longer entertaining because they aren't the right amount of challenging

Dungeon Builder will complete its objectives by appropriately matching players and dungeons so clearing dungeons is fun and challenging, as well as making them worthwhile by rewarding the player with resources to upgrade and expand their party.

## Dungeon Editing
A player interested in creating a dungeon is given a **Resource Allowance**, henceforth denoted as **RA** for short. A player's **RA** dictates what he can allocate to the creation of his dungeons in terms of size, landscape, traps, enemy units, and bosses. 

> The player creating the dungeon is limited by his **Resource Allowance** which is proportional to his party's **Strength Rating**

Dungeon Builder takes in a lot of variables when evaluating a dungeon's **SR**, but primarily relies on its win/loss ratio. Because Dungeon Builder's matchmaking algorithms don't take into account the amount of resources used in the dungeon, this means players can theoretically create a dungeon for any **SR**, but the game will most likely determine the dungeon's **SR** to be at or lower than the dungeon creator's **SR** because the players won't have a high enough **RA** to easily create a dungeon with an **SR** higher than their own.

Another one of Dungeon Builder's responsibilities is to ensure a good distribution of dungeons. The game not only rewards players who clear dungeons with resources, but rewards players who create dungeons within a certain **SR** range.

For example, the game will always incentivize the creation of good dungeons, but if Dungeon Builder identifies an influx of players with a 12 **SR**, it will especially incentivize the creation of dungeons in that **SR** range to meet the influx of players with a healthy amount of entertaining dungeons for that **SR**. 

Once a player creates a dungeon, it will be placed in a trial period. Players exploring dungeons will be given the option to play trial dungeons to help determine the true **SR** of the dungeon. Because trial dungeons are generally lower in quality than other dungeons, Dungeon Builder will incentivize the playing of these trial dungeons to the players as well. 

In addition to a **Resource Allowance**, the creators of the dungeons have a **Loot Allowance** that is proportional to the **Strength Rating** they initially design the dungeon for. **Loot Allowance** is a metric that measures how much loot can be stored in the dungeon for players to earn. 

One of Dungeon Builder's objectives is to make sure getting loot from dungeon clearing is worthwhile, so it delays rewarding players loot they earn from clearing trial dungeons. Dungeon Builder will reward players who beat dungeons with a higher **SR** than theirs with more loot, and penalize the loot of a player beating dungeons with a lower **SR** than their own. Because the **SR** of a trial dungeon is liable to change during its trial period, Dungeon Builder can't immediately distribute loot to exploring parties without fear of some parties getting loot they didn't earn. 

Trial periods solve this by giving Dungeon Builder's ranking algorithms time to evaluate the true dungeon **SR**. Once it has done so the dungeon has completed its trial period, and the player loot is distributed.

> For instance, if a player designs a 20 **SR** dungeon that actually should be 10 **SR**, players clearing the dungeon will get the loot they would normally receive having completed a 10 **SR** dungeon.

> Likewise, if a player designs a 10 **SR** dungeon that actually should be 20 **SR**, players clearing the dungeon will get the loot they would normally receive having completed a 20 **SR** dungeon.

In addition to the scaled loot the exploring party will also earn a bonus for playing the trial dungeon. Dungeon Builder does this to encourage players to play trial dungeons in the future to increase quality content.

## Future Gameplay
In addition to ranking dungeons based on **Strength Rating**, Dungeon Builder will rank dungeons based on player enjoyment by asking for feedback after dungeon completion. With this system in place, Dungeon Builder can supply players with a large amounts of challenging and entertaining dungeons to be cleared.  

**Strength Rating** won't have a cap but increasing it will become progressively harder. As players reach higher **SR** Dungeon Builder will ensure there are new dungeons to be played at that **SR**, but developers will be required to add more party customization options and expand on the dungeon editor content to ensure the game doesn't become stale.

















