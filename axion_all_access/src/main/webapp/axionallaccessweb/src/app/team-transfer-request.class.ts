import { Team } from './team.class';
import { Superbeing } from './superbeing.class';
import { RequestStatus } from './request-status.class';

export class TeamTransferRequest {
   teamTransferId: number;
   requestStatus: RequestStatus;
   superBeing: Superbeing;
   team: Team;
 }