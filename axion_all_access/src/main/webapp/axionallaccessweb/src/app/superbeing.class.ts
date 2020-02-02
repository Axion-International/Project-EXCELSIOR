import { Alignment } from './alignment.class';
import { Team } from './team.class';
import { Location } from './location.class';

export class Superbeing {
   superBeingId: number;
   team: Team;
   location: Location;
   alignment: Alignment;
   superName : string;
   firstName: string;
   lastName: string;
   leader: boolean;
   strength: number;
   constitution: number;
   agility: number;
   intelligence: number;
   abilities: string; 
 }
 