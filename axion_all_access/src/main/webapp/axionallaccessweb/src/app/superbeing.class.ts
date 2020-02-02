import { Alignment } from './alignment.class';
import { Team } from './team.class';
import { Location } from './location.class';

export class Superbeing {
   superbeingId: number;
   team: Team;
   location: Location;
   alignment: Alignment;
   supername : string;
   firstname: string;
   lastname: string;
   leader: boolean;
   strength: number;
   constitution: number;
   agility: number;
   intelligence: number;
   abilities: string; 
 }
 